
# Deezer API Java wrapper


## Installation



##Documentation

For this wrapper: [javadoc](https://hugodesb.github.io/deezer-api-java-wrapper/index.html).

For the Deezer API: [Documentation](https://developers.deezer.com/api/).

## Usage

### Create an instance of the service
To use the Deezer API, you need to register your app at [https://developers.deezer.com/myapps](https://developers.deezer.com/myapps).
Once it is done, `app_id`and `secretKey` will be available on your app's dashboard and `redirectURI` needs to be specified there.

Using this data, you an then create an instance of the DeezerApi service : 
````java
// For all requests an access token is needed
DeezerApi deezerApi = new DeezerApi(app_id, redirectURI, secretKey)
        .build();
````

### OAuth

To get the URI for App Authorization:
```java

// Create a request object with the optional parameter "market"
final AuthorizationServerSideUriRequest request = deezerApi.getAuthorizationServerSideUri()
        .build();

final Uri uri = request.execute();
```

To request access token:
```java
final AuthorisationServerSideTokenRequest request = deezerApi.getAuthorisationServerSideToken(code)
    .build();                 
try {
    final Credentials credentials = request.execute();
} catch (ParseException | DeezerApiException | IOException e) {
    System.out.println("Something went wrong!\n" + e.getMessage());
}
```

###Requests

Every request follow this overall structure: 
```java

final MyRequest request = deezerApi.getSomething().specifically(data)
    .build();
try {
    final Something result = request.execute();
} catch (ParseException | DeezerApiException | IOException e) {
    System.out.println("Something went wrong!\n" + e.getMessage());
}
```
For example to get an album tracks:
```java
AlbumTracksRequest request = deezerApi.album(albumId).tracks()
    .build();

try {
    Page<Track3> result = request.execute();

    //Do something with it now !

} catch (DeezerApiException | IOException | ParseException e) {
    e.printStackTrace();
}
```

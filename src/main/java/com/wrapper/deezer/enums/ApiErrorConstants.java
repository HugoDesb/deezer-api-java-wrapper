package com.wrapper.deezer.enums;

public interface ApiErrorConstants {
    int QUOTA = 4;    //Exception 	4
    int ITEMS_LIMIT_EXCEEDED = 100;    //Exception 	100
    int PERMISSION = 200;    //OAuthException 	200
    int TOKEN_INVALID = 300;    //OAuthException 	300
    int PARAMETER = 500;    //ParameterException 	500
    int PARAMETER_MISSING = 501;    //MissingParameterException 	501
    int QUERY_INVALID = 600;    //InvalidQueryException 	600
    int SERVICE_BUSY = 700;    //Exception 	700
    int DATA_NOT_FOUND = 800;    //DataException 	800
    int INDIVIDUAL_ACCOUNT_NOT_ALLOWED = 901;// 	IndividualAccountChangedNotAllowedException 	901

}

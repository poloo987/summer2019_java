package homework;
/*_200, OK _201, Created_202, Accepted _301, Moved Permanently
  
  _303, See Other_304, Not Modified_307, Temporary Redirect 

  _400, Bad Request_401, Unauthorized_403, Forbidden_404, Not Found_410, Gone

  _500, Internal Server Error_503, Service Unavailable */


public class HTTPS_status_code {
public static void main(String[] args) {
int statuscode = 303;
if      ( statuscode ==200 ) { System.out.println("ok");}
else if (statuscode== 201 )  { System.out.println("Created");}
else if (statuscode== 202 )  { System.out.println("Accepted");}

else if (statuscode== 301 )  { System.out.println("Moved Permanently");}
else if (statuscode== 303 )  { System.out.println("See Other");}
else if (statuscode== 304 )  { System.out.println("Not Modified");}
else if (statuscode== 307 )  { System.out.println("Temporary Redirect");}

else if (statuscode== 400 )  { System.out.println("Bad Request");}
else if (statuscode== 401 )  { System.out.println("Unauthorized");}
else if (statuscode== 403 )  { System.out.println("Forbidden");}
else if (statuscode== 404 )  { System.out.println("Not Found");}
else if (statuscode== 410 )  { System.out.println("Gone");}

else if (statuscode== 500 )  { System.out.println("Internal Server");}
else if (statuscode== 503 )  { System.out.println("Service Unavailable");}

else {System.out.println ("invaled statuscode ");}


}
}
 
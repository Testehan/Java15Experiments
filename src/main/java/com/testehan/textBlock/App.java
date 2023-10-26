package com.testehan.textBlock;


public class App 
{
    public static void main( String[] args )
    {
        String quotes = """       
                ""\"
                """;
        System.out.println(quotes);

        // before
        String query2 = "SELECT \"EMP_ID\", \"LAST_NAME\" FROM \"EMPLOYEE_TB\"\n" +
                "WHERE \"CITY\" = 'INDIANAPOLIS'\n" +
                "ORDER BY \"EMP_ID\", \"LAST_NAME\";\n";
        System.out.println(query2);

        // after, with text blocks things look much better
        String query = """
               SELECT "EMP_ID", "LAST_NAME" FROM "EMPLOYEE_TB"
               WHERE "CITY" = 'INDIANAPOLIS'
               ORDER BY "EMP_ID", "LAST_NAME";
               """;
        System.out.println( query );

        // as you can see below, the useless spaces, that are ony used for indentation of Java source code, are removed
        String html = """
              <html>
                  <body>
                      <p>Hello, world</p>
                  </body>
              </html>
              """;
        System.out.println(html);
    }
}

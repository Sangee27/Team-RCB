package org.testvag.functions;



public class apiFunctions {

    //Mocking response
    public static String playersDetails() {
        return "{\n" +
                "  \"name\": \"Royal Challengers Bangalore\",\n" +
                "  \"location\": \"Bangalore\",\n" +
                "  \"player\": [\n" +
                "    {\n" +
                "      \"name\": \"Faf Du Plessis\",\n" +
                "      \"country\": \"South Africa\",\n" +
                "      \"role\": \"Batsman\",\n" +
                "      \"price-in-crores\": \"7\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"name\": \"Virat Kohli\",\n" +
                "      \"country\": \"India\",\n" +
                "      \"role\": \"Batsman\",\n" +
                "      \"price-in-crores\": \"15\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"name\": \"Glenn Maxwell\",\n" +
                "      \"country\": \"Australia\",\n" +
                "      \"role\": \"Batsman\",\n" +
                "      \"price-in-crores\": \"11\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"name\": \"Mohammad Siraj\",\n" +
                "      \"country\": \"India\",\n" +
                "      \"role\": \"Bowler\",\n" +
                "      \"price-in-crores\": \"7\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"name\": \"Harshal Patel\",\n" +
                "      \"country\": \"India\",\n" +
                "      \"role\": \"Bowler\",\n" +
                "      \"price-in-crores\": \"10.75\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"name\": \"Wanindu Hasaranga\",\n" +
                "      \"country\": \"Srilanka\",\n" +
                "      \"role\": \"Bowler\",\n" +
                "      \"price-in-crores\": \"10.75\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"name\": \"Dinesh Karthik\",\n" +
                "      \"country\": \"India\",\n" +
                "      \"role\": \"Wicket-keeper\",\n" +
                "      \"price-in-crores\": \"5.5\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"name\": \"Shahbaz Ahmed\",\n" +
                "      \"country\": \"India\",\n" +
                "      \"role\": \"All-Rounder\",\n" +
                "      \"price-in-crores\": \"2.4\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"name\": \"Rajat Patidar\",\n" +
                "      \"country\": \"India\",\n" +
                "      \"role\": \"Batsman\",\n" +
                "      \"price-in-crores\": \"0.20\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"name\": \"Josh Hazlewood\",\n" +
                "      \"country\": \"Australia\",\n" +
                "      \"role\": \"Bowler\",\n" +
                "      \"price-in-crores\": \"7.75\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"name\": \"Mahipal Lomror\",\n" +
                "      \"country\": \"India\",\n" +
                "      \"role\": \"Bowler\",\n" +
                "      \"price-in-crores\": \"7.75\"\n" +
                "    }\n" +
                "  ]\n" +
                "}";
    }

}

/* Below steps can't be implemented as required details[Headers,Body,Endpoint URL] were not provided.

   => Build Request Header
    public RequestSpecification playerRequest() throws FileNotFoundException {
    request = new RequestSpecBuilder().setBaseUri({{BASE_URI}})
            .setContentType({{Content_Type}})
            .addHeader({{Header1}})
            .addHeader({{Header2}})
            .build();
    return request;
    }

    => Extracting Response by providing Request and hitting appropriate endpoint
    public Response getPlayerDetails() throws FileNotFoundException {
        request = given().spec(playerRequest());
        responseCodeValidation  = new ResponseSpecBuilder().expectStatusCode(201).build();
        response = request.when().post({{ENDPOINT}})
                .then().spec(response).extract().response();
        return response;
        }

 */


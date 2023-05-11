package base;

import files.Payload;
import io.restassured.path.json.JsonPath;

public class Two {
    public static void main(String[] args) {
        int sum = 0;
        JsonPath js = new JsonPath(Payload.dynamicResponse());
        //get the total number of courses present in it
        int count = js.getInt("courses.size()");
        System.out.println(count);
        //___2.Print Purchase Amount
        int amount = js.getInt("dashboard.purchaseAmount");
        System.out.println("Total purchase amount is " + amount);
        //First title of the course
        String course_Title = js.get("courses[0].title");
        System.out.println(course_Title);
        //Print All course titles and their respective Prices
        for (int i = 0; i < count; i++) {
            String title = js.get("courses[" + i + "].title");
            int coursePrice = js.getInt("courses[" + i + "].price");
            int copies = js.getInt(("courses[" + i + "].copies"));
            sum = sum + (coursePrice * copies);
            System.out.println(sum);
            // System.out.println(title);
            //System.out.println(coursePrice);
            // System.out.println(js.get("courses[" + i + "].price").toString());

            //________Print no of copies sold by RPA Course__________________
            if (title.equalsIgnoreCase("RPA")) {
                int price = js.getInt("courses[" + i + "].copies");
                System.out.println(price);
            }
        }
        //_________________ Verify if Sum of all Course prices matches with Purchase Amount
        if (amount == sum) {
            System.out.println("True");
        } else {
            System.out.println("false");
        }

    }
}

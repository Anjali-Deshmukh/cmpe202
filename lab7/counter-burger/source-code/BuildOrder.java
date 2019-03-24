  

public class BuildOrder {

    public static Component getOrder()
    {
        Composite order = new Composite( "Order" ) ;

        CustomBurger customBurger1 = new CustomBurger( "Build Your Own Burger" ) ;
        // base price for 1/3 lb
        Burger b1 = new Burger( "Burger Options" ) ;
        String[] bo1 = { "Organic Bison*", "1/2lb.", "On A Bun" } ;
        b1.setOptions( bo1 ) ;

        //extra cheese +1.00
        Cheese c1 = new Cheese( "Cheese Options" ) ;
        String[] co1 = { "Yellow American", "Spicy Jalepeno Jack" } ;
        c1.setOptions( co1 ) ;
        c1.wrapDecorator( b1 ) ;
        //Premium cheese (1.50 per selection)
        PremiumCheese pc1 = new PremiumCheese( "PremiumCheese Options" ) ;
        String[] pco1 = { "Daniesh Blue Cheese" } ;
        pc1.setOptions( pco1 ) ;
        pc1.wrapDecorator( c1 ) ;

        // 1 sauce free, extra +.50
        Sauce s1 = new Sauce( "Sauce Options" ) ;
        String[] so1 = { "Mayonnaise", "Thai Peanut Sauce" } ;
        s1.setOptions( so1 ) ;
        s1.wrapDecorator( pc1 ) ;
        // Unlimited Toppings
        Toppings t1 = new Toppings( "Toppings Options" ) ;
        String[] to1 = { "Dill Pickle Chips", "Black Olives", "Spicy Pickles" } ;
        t1.setOptions( to1 ) ;
        t1.wrapDecorator( s1 ) ;
        // premium topping 1.00 per selection, Marinated Tomatoes - 3
        PremiumToppings pt1 = new PremiumToppings( "PremiumToppings Options" ) ;
        String[] pto1 = { "Marinated Tomatoes"} ;
        pt1.setOptions( pto1 ) ;
        pt1.wrapDecorator( t1 ) ;
        // Choose a Bun
        Bun bn1 = new Bun("Bun Options") ;
        String[] bno1 = { "Ciabatta (Vegan)" } ;
        bn1.setOptions( bno1 ) ;
        bn1.wrapDecorator( pt1 ) ;
        // Choose a Side
        Side sd1 = new Side("Side Options") ;
        String[] sdo1 = { "Shoestring Fries" } ;
        sd1.setOptions( sdo1 ) ;
        sd1.wrapDecorator( bn1 ) ;

        // Setup Custom Burger Ingredients
        customBurger1.setDecorator( sd1 ) ;
        customBurger1.addChild( b1 ) ;
        customBurger1.addChild( c1 ) ;
        customBurger1.addChild( pc1 ) ;
        customBurger1.addChild( s1 ) ;
        customBurger1.addChild( t1 ) ;
        customBurger1.addChild( pt1 ) ;
        customBurger1.addChild( bn1 ) ;
        customBurger1.addChild( sd1 ) ;

        // Add Custom Burger to the Order
        order.addChild( customBurger1 );


        CustomBurger customBurger2 = new CustomBurger( "Build Your Own Burger" ) ;
        // base price for 1/3 lb
        Burger b2 = new Burger( "Burger Options" ) ;
        String[] bo2 = { "Hormone & Antibiotic Free Beef", "1/3lb.", "On A Bun" } ;
        b2.setOptions( bo2 ) ;

        //extra cheese +1.00
        Cheese c2 = new Cheese( "Cheese Options" ) ;
        String[] co2 = { "Smoked Gauda", "Greek Feta" } ;
        c2.setOptions( co2 ) ;
        c2.wrapDecorator( b2 ) ;
        //Premium cheese (1.50 per selection)
        PremiumCheese pc2 = new PremiumCheese( "PremiumCheese Options" ) ;
        String[] pco2 = { "Fresh Mozzarella" } ;
        pc2.setOptions( pco2 ) ;
        pc2.wrapDecorator( c2 ) ;

        // 1 sauce free, extra +.50
        Sauce s2 = new Sauce( "Sauce Options" ) ;
        String[] so2 = { "Habanero Salsa" } ;
        s2.setOptions( so2 ) ;
        s2.wrapDecorator( pc2 ) ;
        // Unlimited Toppings
        Toppings t2 = new Toppings( "Toppings Options" ) ;
        String[] to2 = { "Crushed Peanuts" } ;
        t2.setOptions( to2 ) ;
        t2.wrapDecorator( s2 ) ;
        // premium topping 1.00 per selection, Marinated Tomatoes - 3
        PremiumToppings pt2 = new PremiumToppings( "PremiumToppings Options" ) ;
        String[] pto2 = { "Sunny Side Up Egg*", "Marinated Tomatoes" } ;
        pt2.setOptions( pto2 ) ;
        pt2.wrapDecorator( t2 ) ;
        // Choose a Bun
        Bun bn2 = new Bun("Bun Options") ;
        String[] bno2 = { "Gluten-Free Bun" } ;
        bn2.setOptions( bno2 ) ;
        bn2.wrapDecorator( pt2 ) ;
        // Choose a Side
        Side sd2 = new Side("Side Options") ;
        String[] sdo2 = { "Shoestring Fries" } ;
        sd2.setOptions( sdo2 ) ;
        sd2.wrapDecorator( bn2 ) ;

        // Setup Custom Burger Ingredients
        customBurger2.setDecorator( sd2 ) ;
        customBurger2.addChild( b2 ) ;
        customBurger2.addChild( c2 ) ;
        customBurger2.addChild( pc2 ) ;
        customBurger2.addChild( s2 ) ;
        customBurger2.addChild( t2 ) ;
        customBurger2.addChild( pt2 ) ;
        customBurger2.addChild( bn2 ) ;
        customBurger2.addChild( sd2 ) ;

        // Add Custom Burger to the Order
        order.addChild( customBurger2 );
        return order ;
    }

}


/*

Counter Burger Menu:
https://thecounterburger.emn8.com/?store=Times%20Square

*/
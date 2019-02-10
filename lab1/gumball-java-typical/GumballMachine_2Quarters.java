public class GumballMachine_2Quarters {

    private int num_gumballs;
    private boolean has_quarter;
    private int quarter_count;

    public GumballMachine_2Quarters(int size )
    {
        // initialise instance variables
        this.num_gumballs = size;
        this.has_quarter = false;
        this.quarter_count = 0;
    }

    public void insertQuarter(int coin)
    {
        if(coin != 25){
            System.out.println( "Not a valid coin, please enter a quarters." ) ;
            return;
        }

            this.quarter_count += 1;


        if(this.quarter_count >= 2){
            this.has_quarter = true;
        }else
            this.has_quarter = false ;
    }

    public void turnCrank()
    {
        if ( this.has_quarter )
        {
            if ( this.num_gumballs > 0 )
            {
                this.num_gumballs-- ;
                this.has_quarter = false ;
                this.quarter_count = 0;
                System.out.println( "Thanks for your quarters.  Gumball Ejected!" ) ;
            }
            else
            {
                System.out.println( "No More Gumballs!  Sorry, can't return your quarters." ) ;
            }
        }
        else
        {
            System.out.println( "Please insert a two quarters" ) ;
        }
    }
}

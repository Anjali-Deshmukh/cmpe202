public class GumballMachine_AllCoins {

    private int num_gumballs;
    private boolean has_enough_coins;
    final int GUMBALL_COST = 50;
    private int total_inserted_value;

    public GumballMachine_AllCoins(int size )
    {
        // initialise instance variables
        this.num_gumballs = size;
        this.has_enough_coins = false;
        this.total_inserted_value = 0;
    }

    public void insertCoin(int coin)
    {
        this.total_inserted_value += coin;

        if ( this.total_inserted_value >= this.GUMBALL_COST )
            this.has_enough_coins = true ;
        else
            this.has_enough_coins = false ;
    }

    public void turnCrank()
    {
        if ( this.has_enough_coins)
        {
            if ( this.num_gumballs > 0 )
            {
                this.num_gumballs-- ;
                this.has_enough_coins = false ;
                System.out.println( "Thanks for your coins.  Gumball Ejected!" ) ;
            }
            else
            {
                System.out.println( "No More Gumballs!  Sorry, can't return your money." ) ;
            }
        }
        else
        {
            System.out.println( "Please insert a coins equivalent to 50 cents" ) ;
        }
    }
}

package banker;

import exceptions.InsufficientFundsError;

/**
 *
 * This class represents the {@link Banker} that may give
 * or accept money from players.
 */
public class Banker {

    /**
     * Singleton instance of the {@link Banker}.
     */
    private static Banker instance;

    /**
     * The total amount of money the {@link Banker} owns.
     */
    private static int reserve = 20000;

    /**
     * Private constructor so this entity can only exist once.
     */
    private Banker(){
        //do nothing
    }

    /**
     * Get the singleton instance of the {@link Banker}.
     * If not created yet, create.
     *
     * @return singleton instance of Jailer.
     */
    public static Banker getInstance(){
        if(instance == null){
            instance = new Banker();
        }
        return instance;
    }

    /**
     * Getting money from this {@link Banker}.
     * @param amount the requested amount of money.
     * @return amount of money requested by the player.
     * @throws InsufficientFundsError if there is not enough money to complete
     *          the request.
     */
    public int getMoney(int amount) throws InsufficientFundsError {
        if(amount < reserve){
            reserve -= amount;
            return amount;
        } else {
            throw new InsufficientFundsError();
        }
    }

    /**
     * The {@link Banker} accepting money from another player.
     * @param amount the amount of money given by a player.
     */
    public void acceptMoney(int amount){
        reserve += amount;
    }

}

package jail;

/**
 * This class represents the {@link Jailer} that may detain
 * or release jailed players.
 */
public class Jailer {

    /**
     * Singleton instance of the {@link Jailer}.
     */
    private static Jailer instance;

    /**
     * Private constructor so this entity can only exist once.
     */
    private Jailer(){
        //do nothing
    }

    /**
     * Get the singleton instance of the {@link Jailer}.
     * If not created yet, create.
     *
     * @return singleton instance of Jailer.
     */
    public static Jailer getInstance(){
        if(instance == null){
            instance = new Jailer();
        }
        return instance;
    }

    /**
     * Place the player in jail.
     */
    public void jail(){

    }

    /**
     * Release the player from jail.
     */
    public void release(){

    }
}

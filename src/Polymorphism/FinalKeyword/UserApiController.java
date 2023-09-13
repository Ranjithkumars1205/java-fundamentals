package Polymorphism.FinalKeyword;

public class UserApiController extends CommonApiController {
    final String USER_ID;
    static final int data;// static blank final variable

    {
        USER_ID = "123"; // we can initialize the blank final variable here and constructor only.
    }

    static {
        // A static final variable that is not initialized at the time of declaration is
        // known as static blank final variable. It can be initialized only in static
        // block.
        data = 50;
    }

    public User getUserApi(final String UserID) {
        // If you declare any parameter as final, you cannot change the value of it.
        return null;
    }

    /**
     * If you make any method as final, you cannot override it.
     * final method is inherited but you cannot override it (new
     * CommonApiController().getStoreJson())
     * 
     * Cannot override the final method from CommonApiControllerJava(67109265)
     * 
     */
    // public final String getStoreJSON() {
    // return null;
    // }

}

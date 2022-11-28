import java.util.Date;
public class AlfredQuotes {

    public String basicGreeting() {
        // You do not need to code here, this is an example method
        return "Hello, lovely to see you. How are you?";
    }

    public String guestGreeting(String name) {
        // YOUR CODE HERE
        return String.format("Hello, %s. Lovely to See you!",name);
    }

    public String dateAnnouncement() {
        // YOUR CODE HERE
        Date currentDate = new Date();
        return String.format("It is currently %s",currentDate);
    }

    public String respondBeforeAlexis(String conversation) {
        // YOUR CODE HERE
        int alexisFound = conversation.indexOf("Alexis");
        int alfredFound = conversation.indexOf("Alfred");
        String response = "Right. And with that I shall retire.";
        if (alexisFound != -1){
            response =  "Right away, sir. She certainly isn't sophisticated enough for that.";
        }
        else if (alfredFound != -1){
            response =  "At your service. As you wish, naturally.";
        }
        return response;
    }

    // NINJA BONUS
    // See the specs to overload the guessGreeting method
    // SENSEI BONUS
    // Write your own AlfredQuote method using any of the String methods you have learned!
}


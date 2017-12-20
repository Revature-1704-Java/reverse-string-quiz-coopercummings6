package quiz;

public class ReverseString {
    /*
    *reverse reverses the order of characters in a string
    *@param input The string to reverse
    *@return a string containing the characters of the input in reverse order
    */
    public String reverse(String input) {
        StringBuffer output = new StringBuffer();//create stringbuffer to store reversed characters

        for(int i = input.length() - 1; i > -1; i--)    //iterate through input from end to beginning
        {
            output.append(input.charAt(i));//append character at cursor to stringbuffer
        }
        return output.toString();
    }
}
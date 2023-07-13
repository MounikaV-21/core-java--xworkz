class ChatAngadi{
public static void main(String angadi[]){
String chatNames[] = {"Pani Puri", "Samosa", "Bhel Puri"};
//invoke logic(methods)
//argument
getChatNames(chatNames);   //argument //invoking a method
}
public static void getChatNames(String chatNames[]){   //parameter
System.out.println("List of chats are: ");
   for(String chatName : chatNames){
   System.out.println(chatName);
   }	
   
}
}


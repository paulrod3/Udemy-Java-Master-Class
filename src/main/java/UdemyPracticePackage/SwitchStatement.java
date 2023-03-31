package UdemyPracticePackage;

public class SwitchStatement {
    public static void main(String[] args) {
//        int value = 3;
//        if (value ==1) {
//            System.out.println("Value was 1");
//        } else if (value ==2) {
//            System.out.println("Value was 2");
//        } else {
//            System.out.println("Was not 1 or 2");
//        }

//        //Enhanced Switch Statement
//        int switchValue = 22;
//        String month;
//        switch (switchValue) {
//            case 1 -> System.out.println("Value was 1");
//            case 2 -> System.out.println("Value was 2");
//            case 3, 4, 5 -> {
//                System.out.println("Was a 3, a 4, or a 5");
//                System.out.println("Actually it was a " + switchValue);
//            }
//            default -> {
//                System.out.println("was not 1, 2, 3, 4, or 5");
//                System.out.println("Actually it was a " + switchValue);
//            }
        String month = "XYZ";
            System.out.println(month + " is in the " + getQuarter(month) + "quarter");
        }
        public static String getQuarter (String month){
            return switch (month) {
                case "January", "February", "MArch" -> "1st ";
                case "April", "May", "June" -> "2nd ";
                case "July", "August", "September" -> "3rd ";
                case "October", "November", "December" -> "4th ";
                default ->  {
                    String badResponse = month + " is bad";
                    yield badResponse;}

            };

        }
    }

//------------Traditional switch statement  ---------------
//    int switchValue = 22;
//    switch (switchValue) {
//            case 1:
//            System.out.println("Value was 1");
//            break;
//            case 2:
//            System.out.println("Value was 2");
//            break;
//            case 3: case 4: case 5:
//            System.out.println("Was a 3, a 4, or a 5");
//            System.out.println("Actually it was a " + switchValue);
//            break;
//default:
//        System.out.println("was not 1, 2, 3, 4, or 5");
//        System.out.println("Actually it was a " + switchValue);
//        break;

//------------ Another Example ------------------
// switch (month) {
//         case "January":
//         case "February":
//         case "MArch":
//         return "1st ";
//         case "April":
//         case "May":
//         case "June":
//         return "2nd ";
//         case "July":
//         case "August":
//         case "September":
//         return "3rd ";
//         case "October":
//         case "November":
//         case "December":
//         return "4th ";
//         }
//         return "Bad";
//Jeff Smith
//Project 1
//1/12/2023


import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        System.out.println("To end program, type end");
        Scanner metarTranslation = new Scanner(System.in);
        //creates Scanner for user input
        while(true) {
            System.out.println("Enter your METAR report");
            //reads the user input
            String metar = metarTranslation.nextLine();
            //searches user input for these METAR abbreviations
            if (metar.equals("+")) {
                System.out.println("Heavy intensity");
            }
            else if (metar.equals("-")) {
                System.out.println("Light intensity");
            }
            else if (metar.equals("B")) {
                System.out.println("Began At Time");
            }
            else if (metar.equals("DZ")) {
                System.out.println("Drizzle");
            }
            else if (metar.equals("E")) {
                System.out.println("Ended At Time");
            }
            else if (metar.equals("HZ")) {
                System.out.println("Haze");
            }
            else if (metar.equals("RA")) {
                System.out.println("Rain");
            }
            else if (metar.equals("SN")) {
                System.out.println("Snow");
            }
            //ends while loop if user types end
            else if (metar.equals("end")) {
                break;
            }
            else {
                System.out.println("Unknown abbreviation.");
            }


            }
        }
    }


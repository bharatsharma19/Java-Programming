
public class File {
    public File(String string) {
    }

    public static void main(String[] args) {

        // Code to create a new file
        /*
         * File myFile = new File("cwh111file.txt");
         * try {
         * myFile.createNewFile();
         * } catch (IOException e) {
         * System.out.println("Unable to create this file");
         * e.printStackTrace();
         * }
         * 
         * 
         * // Code to write to a file
         * try {
         * FileWriter fileWriter = new FileWriter("cwh111file.txt");
         * fileWriter.write("This is our first file from this java course\nOkay now bye"
         * );
         * fileWriter.close();
         * } catch (IOException e) {
         * e.printStackTrace();
         * }
         * 
         * // Reading a file
         * File myFile = new File("cwh111file.txt");
         * try {
         * Scanner sc = new Scanner(myFile);
         * while(sc.hasNextLine()){
         * String line = sc.nextLine();
         * System.out.println(line);
         * }
         * sc.close();
         * } catch (FileNotFoundException e) {
         * e.printStackTrace();
         * }
         */
        // Deleting a file
        File myFile = new File("file1.txt");
        if (myFile.delete()) {
            System.out.println("I have deleted: " + myFile.getName());
        } else {
            System.out.println("Some problem occurred while deleting the file");
        }

    }

    private String getName() {
        return null;
    }

    private boolean delete() {
        return false;
    }
}

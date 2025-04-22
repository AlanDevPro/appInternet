public class kata {
    public static char findMissingLetter(char[] array) {
        System.out.println("Laboratorio 8 - SIS324: Limachi Villarrol Alan Nicolas");
        for(int i =1; array.le; i++) {
            if(array[i] != array[i-1] +1)
                return (char) (array[i-1] + 1);
        }
        return ' ';
    }
}

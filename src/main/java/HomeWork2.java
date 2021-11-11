public class HomeWork2 {

    public static void main(String[] args) {
        String [][] testMass= new String[4][4];
        testMass[0][0] = "1";
        testMass[0][1] = "1";
        testMass[0][2] = "1";
        testMass[0][3] = "1";
        testMass[1][0] = "1";
        testMass[1][1] = "1";
        testMass[1][2] = "1";
        testMass[1][3] = "1";
        testMass[2][0] = "1";
        testMass[2][1] = "1";
        testMass[2][2] = "1";
        testMass[2][3] = "1";
        testMass[3][0] = "1";
        testMass[3][1] = "1";
        testMass[3][2] = "1";
        testMass[3][3] = "1";
        try{
            summMass(testMass);
        }
        catch (MyArraySizeException e){
            System.out.println("Некорректный размер массива");
        }
        catch (MyArrayDataException e){
            System.out.println("Ошибка при преобразовании массива");
        }



    }
    public static void summMass(String[][] mass) throws MyArraySizeException, MyArrayDataException {
        //System.out.println("test");
        //System.out.println(mass[].length);
        //throw new MyArrayDataException();
        int resultConvert;
        int summ=0;
        if (mass.length!=4 | mass[0].length!=4){
            throw new MyArraySizeException();
        }
        else{
            for (int i=0;i<4;i++){
                for (int j=0;j<4;j++){
                    try{
                        resultConvert=Integer.parseInt(mass[i][j]);
                        summ+=resultConvert;
                    }
                    catch (NumberFormatException e){
                        System.out.println("Элемент массива ["+i+"]["+j+"]");
                        throw new MyArrayDataException();
                    }
                }
            }
            System.out.println("Сумма элементов массива = "+summ);
        }
    }
}

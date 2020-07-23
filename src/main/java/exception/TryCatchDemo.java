package exception;

public class TryCatchDemo {
    public static void main(String[] args) {
        try{
            int res = 100/0;
        }finally {
            //
        }
        try{
            try{

            }catch (ArithmeticException ae){
                try{

                }catch (NullPointerException n){

                }
            }

        }catch (NullPointerException ne){

        }
        catch (ArithmeticException ae){

        }
        catch (NumberFormatException nue){

        }catch (Exception e){

        }

        finally {
            try{

            }catch (Exception e){

            }
        }
    }
}

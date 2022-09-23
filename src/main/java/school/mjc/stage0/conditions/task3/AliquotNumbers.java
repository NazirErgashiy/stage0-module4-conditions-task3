package school.mjc.stage0.conditions.task3;

public class AliquotNumbers {
    public void isFirstAliquot(int first, int second) {

        float aliquot=(float) first%(float) second;
        if(aliquot==0.0f)
        {
            System.out.println("Not aliquot");
        }else
        {
            System.out.println("Aliquot");
        }

    }
}

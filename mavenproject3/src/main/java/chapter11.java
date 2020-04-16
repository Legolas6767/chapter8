/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Trey-
 */
public class chapter11 {
    
    private double[] scores;
    double total = 0;
 
    public chapter11(double array[])
    {
        for (int i = 0; i < array.length; i++)
        {
            scores = new double[array.length];
            if (array[i] < 0 || array[i] > 100)
            {
                throw new IllegalArgumentException("Bad scores" + "\n\tInvalid score found." + "\n\tElement: " + i + " Score: " + array[i]);
            }
            else
            {
                scores[i] = array[i];
                total += array[i];
            }
        }
    }
 
    public double getAverage()
    {
        return total / scores.length;
    }
}
 
public class testscorestest
{
    public static void main(String[] args) throws Exception
    {
        double[] badScores = { 97.5, 66.7, 88.0, 10.0, 99.0 };
        double[] goodScores = { 97.5, 66.7, -88.0, 100.0, 99.0 }; // Good scores is actually bad
        TestScores test=null;
 
        try
        {
            test = new TestScores(badScores);
        }
        catch (IllegalArgumentException e)
        {
            System.out.println(e.getMessage());
        }
 
        try
        {
            test = new TestScores(goodScores);
        }
        catch (IllegalArgumentException e)
        {
            System.out.println(e.getMessage());
        }
 
        System.out.print("Good scores"+ "\n\tThe average of the good scores is " + test.getAverage());
    }

    private static class TestScores {

        public TestScores() {
        }

        private TestScores(double[] badScores) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        private String getAverage() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    }
}

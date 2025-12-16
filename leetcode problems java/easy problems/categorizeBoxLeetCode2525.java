class Solution {
    public String categorizeBox(int length, int width, int height, int mass) {
        double p=Math.pow(10,4);
        long v=1L*length*width*height;
        if(((length>=p||width>=p||height>=p)||(v>=Math.pow(10,9)))&&mass>=100)
        {
            return "Both";
        }
        else if((length>=p||width>=p||height>=p)||(v>=Math.pow(10,9)))
        {
            return "Bulky";
        }
        else if(mass>=100)
        {
            return "Heavy";
        }
        else
        {
            return "Neither";
        }

    }
}
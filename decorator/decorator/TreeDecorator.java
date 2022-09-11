package decorator;

import java.util.ArrayList;


public abstract class TreeDecorator extends Tree {
    public TreeDecorator(ArrayList<String> lines) {
        super(lines);

    }
    protected void integrateDecor(ArrayList<String> decor) {
            for(int j = 0; j < decor.size(); j++)
            {
                char[] tempDecor = decor.get(j).toCharArray();
                char[] tempLine = lines.get(j).toCharArray();
                for(int k = 0; k < tempLine.length; k++)
                {
                    if(tempDecor[k] != tempLine[k]);
                    {
                        if(tempLine[k] == ' '){
                        tempLine[k] = tempDecor[k];
                        }
                    }
                    
                }
                String finalLine = String.valueOf(tempLine);
                
                lines.set(j, finalLine);
            }
        


    }


    

    
}

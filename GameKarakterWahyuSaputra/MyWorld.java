import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends greenfoot.World
{
    String[] textMap = {
        "*************",
        "*   . S     *",
        "*           *",
        "*.********  *",
        "*       S*  *",
        "*        *  *",
        "****** **** *",
        "*.     * .S *",
        "*           *",
        "* ****** ****",
        "*S          *",
        "*           *",
        "***** * *****",
        "*P         .*",
        "*************"
    };
    private int skorFrog; 
    private int nyawaFrog=3;
    GreenfootSound backgroundMusic = new GreenfootSound("soundku.mp3");
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(520, 600, 1); 
        prepare();
        drawMap();
        backgroundMusic.playLoop();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {

    }
    
    public int getSkorFrog()
    {
        return skorFrog;
    }
    
    public int getNyawaFrog()
    {
        return nyawaFrog;
    }
    
    public void updSkor(int x)
    {
        skorFrog+=x;
    }
    
    public void updNyawa()
    {
        nyawaFrog--;
    }
    
     private void drawMap(){
        for(int i = 0; i < textMap.length;i++){
            String mapLine = textMap[i];
            for(int j = 0; j < mapLine.length(); j++){
                char mapChor = mapLine.charAt(j);
                int y = i * 40 + 20;
                int x = j * 40 + 20;
                switch(mapChor){
                    case '*':
                        addObject(new ObjectSpecial(), x, y);
                        break;
                    case '.':
                        addObject(new Target(), x, y);
                        break;
                    case 'S':
                        addObject(new Enemy(), x, y);
                        break;    
                     
                    case 'P':
                        addObject(new Character(), x, y);
                    default:
                        break;
                        
                }
            }
        }
    }
}

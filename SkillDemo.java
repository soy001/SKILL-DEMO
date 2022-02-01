public class SkillDemo {
    int x;
    int y; 
    
    public SkillDemo(){
        this.x = 0;
        this.y = 0;
    }
    public SkillDemo(int x, int y){
        this.x = x;
        this.y = y;
    }
    public int add(){
        return x - y;
    }
}

public class Click {
    int click;
    Click(){
        this.click = 0;
    }
    public void onClick(){
        if(this.click < 2){
            this.click++;
        }else if(this.click == 2){
            this.click = 1;
        }
    }
    public void setClick(int click){ this.click = click; }
    public int getClicks(){ return click; }

}

//   ______ _       _     _   _              ______                                        
//   |  ___(_)     | |   | | (_)             |  _  \                                       
//   | |_   _  __ _| |__ | |_ _ _ __   __ _  | | | |_ __ ___  __ _ _ __ ___   ___ _ __ ___ 
//   |  _| | |/ _` | '_ \| __| | '_ \ / _` | | | | | '__/ _ \/ _` | '_ ` _ \ / _ \ '__/ __|
//   | |   | | (_| | | | | |_| | | | | (_| | | |/ /| | |  __/ (_| | | | | | |  __/ |  \__ \
//   \_|   |_|\__, |_| |_|\__|_|_| |_|\__, | |___/ |_|  \___|\__,_|_| |_| |_|\___|_|  |___/
//             __/ |                   __/ |                                               
//            |___/                   |___/        
//APCS1 pd8
//HW31 - Ye Olde Role Playing Game, Expanded
//2017-11-13

//The Myrmidon is a dextrous fencer and a glass cannon.
//High ATK, High DEF, low HP.
//"Specialize" increases ATK and lowers DEF.

public class Myrmidon extends Protagonist {
    public Myrmidon(String s){
	super(s);
	HP = 90;
	atk = 150;
	def = 150;
    }
    public void specialize(){
	atk *= 2;
	def /= 2;
    }

    public void normalize(){
	atk = 150;
	def = 150;
    }
    
    public String about(){
	return "The Myrmidon is fast and agile, having a low HP but strong attack and defense skills. These ruffians are the subordinates of higher level monsters, and their skills in warfare and attitude come together to form a somewhat effective and somehow a definitely more annoying version of the minions from Despicable Me.";
	    }
    
}
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package State1;

/**
 *
 * @author user
 */
public class Developer {
    Activity activity;
    
    public void setActivity(Activity activity) {
        this.activity = activity;
    }
    public void changeActivity() {
        if(activity instanceof Sleeping) {
            setActivity(new Training());
        }else if (activity instanceof Training) {
            setActivity(new Coding());
        }else if (activity instanceof Coding) {
            setActivity(new Eating());
            }else if (activity instanceof Eating) {
             setActivity(new GitHub());
             }else if (activity instanceof GitHub) {
            setActivity(new Reading());
        }else if (activity instanceof Reading) {
            setActivity(new Sleeping());
        }
        }
    public void justDoIt() {
        activity.justDoIt();
    }

    
   
    }
    


package raudain.virtualbeggarrest;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Worker2 implements Worker {
    
    private short room;
    private String name;
    private String profession;
    private String endurance;
    private long cost;
    private String cost_w_comma;


    /**
     * @return the room
     */
    public short getRoom() {

        return room;
    }


	/**
     * @param room the room to set
     */
    public void setRoom(short room) {

        this.room = room;
    }

    /**
     * @return the name
     */
    public String getName() {

        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {

        this.name = name;
    }

    /**
     * @return the profession
     */
    public String getProfession() {

        return profession;
    }

    /**
     * @param profession the profession to set
     */
    public void setProfession(String profession) {

        this.profession = profession;
    }

    /**
     * @return the endurance
     */
    public String getEndurance() {

        return endurance;
    }

    /**
     * @param endurance the endurance to set
     */
    public void setEndurance(String endurance) {

        this.endurance = endurance;
    }

    /**
     * @return the cost
     */
    public long getCost() {

        return cost;
    }

    /**
     * @param cost the cost to set
     */
    public void setCost(final long cost) {

        this.cost = cost;
    }
    
    /**
     * @return the cost with commas
     */
    public String getCostWithComma() {

        return cost_w_comma;
    }

    /**
     * @param cost_w_comma to set
     */
    public void setCostWithComma(String cost_w_comma) {

        this.cost_w_comma = cost_w_comma;
    }
}

package raudain.virtualbeggarrest;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Worker {
    
    private short room;
    private String name;
    private String profession;
    private String endurance;
    private byte level;
    private long cost;


    /**
     * @return the room
     */
    short getRoom() {

        return room;
    }


	/**
     * @param room the room to set
     */
    void setRoom(final short room) {

        this.room = room;
    }

    /**
     * @return the name
     */
    String getName() {

        return name;
    }

    /**
     * @param name the name to set
     */
    void setName(final String name) {

        this.name = name;
    }

    /**
     * @return the profession
     */
    String getProfession() {

        return profession;
    }

    /**
     * @param profession the profession to set
     */
    void setProfession(final String profession) {

        this.profession = profession;
    }

    /**
     * @return the endurance
     */
    String getEndurance() {

        return endurance;
    }

    /**
     * @param endurance the endurance to set
     */
    void setEndurance(final String endurance) {

        this.endurance = endurance;
    }

    /**
     * @return the level
     */
    byte getLevel() {

        return level;
    }

    /**
     * @param level the level to set
     */
    void setLevel(final byte level) {

        this.level = level;
    }

    /**
     * @return the cost
     */
    long getCost() {

        return cost;
    }

    /**
     * @param cost the cost to set
     */
    void setCost(final long cost) {

        this.cost = cost;
    }
    
    @Override
	public String toString() {
		return "Worker [room=" + room + ", name=" + name + ", profession=" + profession + ", endurance=" + endurance
				+ ", level=" + level + ", cost=" + cost + "]";
	}

}

package raudain.virtualbeggarrest;

public interface Worker {
	public short getRoom();


	/**
     * @param room the room to set
     */
    public void setRoom(short room);

    /**
     * @return the name
     */
    public String getName();

    /**
     * @param name the name to set
     */
    public void setName(String name);

    /**
     * @return the endurance
     */
    public String getEndurance();

    /**
     * @param endurance the endurance to set
     */
    public void setEndurance(String endurance);
    
    /**
     * @return the cost
     */
    public long getCost();

    /**
     * @param cost the cost to set
     */
    public void setCost(final long cost);
}

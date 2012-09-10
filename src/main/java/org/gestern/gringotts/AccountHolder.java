package org.gestern.gringotts;



/**
 * An account holder. 
 * Can be a player or another type of entity able to partiticapte in the economy, for instance a faction.
 * 
 * To function correctly within Gringotts, implementors must provide a working equals and hashCode method. 
 * 
 * @author jast
 *
 */
public interface AccountHolder {
    /** 
     * Return name of the account holder.
     * 
     * @return name of the account holder
     */
    String getName();

    /** 
     * Send message to the account holder. 
     * @param message to send
     * */
    void sendMessage(String message);

    int hashCode();
    boolean equals(Object other);

    /**
     * Type of the account holder. For instance "faction" or "player".
     * @return account holder type
     */
	String getType();

	/**
	 * A unique identifier for the account holder.
	 * For players, this is simply the name. For factions, it is their id.
	 * @return unique account holder id
	 */
	String getId();
}

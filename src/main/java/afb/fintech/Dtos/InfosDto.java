/**
 * 
 */
package afb.fintech.Dtos;

import java.io.Serializable;

/**
 * Patron de conception (DTO) utilise pour la transformation de l'objet Infos materialise par l'entite Infos
 * @author <a href="mailto:francis_djiomou@afrilandfirstbank.com">Francis DJIOMOU (First Bank Project Engineer and Research)</a>
 * @since 01 Nov. 2017
 */
@SuppressWarnings("serial")
public class InfosDto implements Serializable {

	/**
	 * Default Constructor
	 */
	public InfosDto() {}
	/**
	 * Titre
	 */
	private String title;
	/**
	 * Contenu
	 */
	private String description;
	/**
	 * Date
	 */
	private String date;
	/**
	 * Auteur
	 */
	private String author;
	/**
	 * @param title
	 * @param description
	 * @param date
	 * @param author
	 */
	public InfosDto(String title, String description, String date, String author) {
		super();
		this.title = title;
		this.description = description;
		this.date = date;
		this.author = author;
	}
	/**
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}
	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}
	/**
	 * @return the date
	 */
	public String getDate() {
		return date;
	}
	/**
	 * @return the author
	 */
	public String getAuthor() {
		return author;
	}
	/**
	 * @param title the title to set
	 */
	public void setTitle(String title) {
		this.title = title;
	}
	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}
	/**
	 * @param date the date to set
	 */
	public void setDate(String date) {
		this.date = date;
	}
	/**
	 * @param author the author to set
	 */
	public void setAuthor(String author) {
		this.author = author;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "InfosDto [title=" + title + ", description=" + description + ", date=" + date + ", author=" + author
				+ "]";
	}
	
}

package afb.fintech.Entity;

import java.util.Date;


import afb.fintech.Enums.Statu2;

public class Rdv {
	
	 private String id;
	 
	 private Date createdAt;
	 
	 private Boolean deleted;
	 
	 private Long duration;
	
	 private String name;
		
	 private String description;
	
	 private Statu2 status;
	
	 private Date dateStart;
	
	 private Date dateEnd;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Statu2 getStatu() {
		return status;
	}

	public void setStatu(Statu2 status) {
		this.status = status;
	}

	public Date getDateStart() {
		return dateStart;
	}

	public void setDateStart(Date dateStart) {
		this.dateStart = dateStart;
	}

	public Date getDateEnd() {
		return dateEnd;
	}

	public void setDateEnd(Date dateEnd) {
		this.dateEnd = dateEnd;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Date getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	public Boolean getDeleted() {
		return deleted;
	}

	public void setDeleted(Boolean deleted) {
		this.deleted = deleted;
	}

	public Long getDuration() {
		return duration;
	}

	public void setDuration(Long duration) {
		this.duration = duration;
	}

	public Statu2 getStatus() {
		return status;
	}

	public void setStatus(Statu2 status) {
		this.status = status;
	}

	public Rdv(String id, Date createdAt, Boolean deleted, Long duration, String name, String description,
			Statu2 status, Date dateStart, Date dateEnd) {
		super();
		this.id = id;
		this.createdAt = createdAt;
		this.deleted = deleted;
		this.duration = duration;
		this.name = name;
		this.description = description;
		this.status = status;
		this.dateStart = dateStart;
		this.dateEnd = dateEnd;
	}

	public Rdv(String name, String description,Statu2 status, Date dateStart, Date dateEnd) {
		super();
	
		this.name = name;
		this.description = description;
		this.status = status;
		this.dateStart = dateStart;
		this.dateEnd = dateEnd;
	}

	
}

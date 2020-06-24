package afb.fintech.Entity;

import java.util.Date;

import afb.fintech.Enums.*;


public class Urgence {
	
	 private String id;
	 
	 private Date createdAt;
	 
	 private Date modifiedAt;
	 
	 private Boolean deleted;
	 
	 private String createdById;
	 
	 private String name;
	
	 private String description;
	
	 private Statu status;
	
	 private Priority priority;
	
	 private Type type;

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

	public Date getModifiedAt() {
		return modifiedAt;
	}

	public void setModifiedAt(Date modifiedAt) {
		this.modifiedAt = modifiedAt;
	}

	public Boolean getDeleted() {
		return deleted;
	}

	public void setDeleted(Boolean deleted) {
		this.deleted = deleted;
	}

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

	public Statu getStatu() {
		return status;
	}

	public void setStatu(Statu status) {
		this.status = status;
	}

	public Priority getPriority() {
		return priority;
	}

	public void setPriority(Priority priority) {
		this.priority = priority;
	}

	public Type getType() {
		return type;
	}

	public void setType(Type type) {
		this.type = type;
	}

	public String getCreatedById() {
		return createdById;
	}

	public void setCreatedById(String createdById) {
		this.createdById = createdById;
	}

	public Urgence(String id, Date createdAt, Date modifiedAt, Boolean deleted, String createdById, String name,
			String description, Statu statu, Priority priority, Type type) {
		super();
		this.id = id;
		this.createdAt = createdAt;
		this.modifiedAt = modifiedAt;
		this.deleted = deleted;
		this.createdById = createdById;
		this.name = name;
		this.description = description;
		this.status = statu;
		this.priority = priority;
		this.type = type;
	}

	public Urgence( String name,String description, Statu statu, Priority priority, Type type) {
		super();
		this.name = name;
		this.description = description;
		this.status = statu;
		this.priority = priority;
		this.type = type;
	}



	 

}

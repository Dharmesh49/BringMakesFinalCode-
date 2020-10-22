package org.websparrow.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "PACK_master")

public class PACK {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "PACK_id")
	private int PackId;
	
	@Column(name = "PACK_name")
	private String PackName;
		
   @Column(name = "Description_PACK")
   private String DescriptionPack;

    @Column(name = "PACK_Action")
	private int PackAction;
	
	public int getPackId() {
		return PackId;
	}

	public void setPackId(int packId) {
		PackId = packId;
	}

	public String getPackName() {
		return PackName;
	}

	public void setPackName(String packName) {
		PackName = packName;
	}

	public String getDescriptionPack() {
		return DescriptionPack;
	}

	public void setDescriptionPack(String descriptionPack) {
		DescriptionPack = descriptionPack;
	}

	public int getPackAction() {
		return PackAction;
	}

	public void setPackAction(int packAction) {
		PackAction = packAction;
	}

	


	

}

package domain.training;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Embeddable;

@Embeddable
public class ParticipationId implements Serializable {
	private Integer idEmployee;
	private Integer idProject;
	private Date date;

	public ParticipationId() {
	}

	public ParticipationId(Integer idEmployee, Integer idProject,
			Date dateOfParticipation) {
		super();
		this.idEmployee = idEmployee;
		this.idProject = idProject;
		this.date = dateOfParticipation;
	}

	public Integer getIdEmployee() {
		return idEmployee;
	}

	public void setIdEmployee(Integer idEmployee) {
		this.idEmployee = idEmployee;
	}

	public Integer getIdProject() {
		return idProject;
	}

	public void setIdProject(Integer idProject) {
		this.idProject = idProject;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((idEmployee == null) ? 0 : idEmployee.hashCode());
		result = prime * result
				+ ((idProject == null) ? 0 : idProject.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ParticipationId other = (ParticipationId) obj;
		if (idEmployee == null) {
			if (other.idEmployee != null)
				return false;
		} else if (!idEmployee.equals(other.idEmployee))
			return false;
		if (idProject == null) {
			if (other.idProject != null)
				return false;
		} else if (!idProject.equals(other.idProject))
			return false;
		return true;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

}

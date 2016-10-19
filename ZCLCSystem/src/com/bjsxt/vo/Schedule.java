package com.bjsxt.vo;

import java.io.Serializable;
import java.util.Date;

public class Schedule implements Serializable{
	Integer id;
	Integer count;
	Integer hostTeamId;
	Integer awayTeamId;
	Date competitionTime;
	String competitionPosition;
	String score;
	String entryPerson;
	Date entryTime;
	
	public Schedule() {
		
	}
	
	public Schedule(Integer id, Integer count, Integer hostTeamId, Integer awayTeamId, Date competitionTime,
			String competitionPosition, String score, String entryPerson, Date entryTime) {
		super();
		this.id = id;
		this.count = count;
		this.hostTeamId = hostTeamId;
		this.awayTeamId = awayTeamId;
		this.competitionTime = competitionTime;
		this.competitionPosition = competitionPosition;
		this.score = score;
		this.entryPerson = entryPerson;
		this.entryTime = entryTime;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getCount() {
		return count;
	}

	public void setCount(Integer count) {
		this.count = count;
	}

	public Integer getHostTeamId() {
		return hostTeamId;
	}

	public void setHostTeamId(Integer hostTeamId) {
		this.hostTeamId = hostTeamId;
	}

	public Integer getAwayTeamId() {
		return awayTeamId;
	}

	public void setAwayTeamId(Integer awayTeamId) {
		this.awayTeamId = awayTeamId;
	}

	public Date getCompetitionTime() {
		return competitionTime;
	}

	public void setCompetitionTime(Date competitionTime) {
		this.competitionTime = competitionTime;
	}

	public String getCompetitionPosition() {
		return competitionPosition;
	}

	public void setCompetitionPosition(String competitionPosition) {
		this.competitionPosition = competitionPosition;
	}

	public String getScore() {
		return score;
	}

	public void setScore(String score) {
		this.score = score;
	}

	public String getEntryPerson() {
		return entryPerson;
	}

	public void setEntryPerson(String entryPerson) {
		this.entryPerson = entryPerson;
	}

	public Date getEntryTime() {
		return entryTime;
	}

	public void setEntryTime(Date entryTime) {
		this.entryTime = entryTime;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((awayTeamId == null) ? 0 : awayTeamId.hashCode());
		result = prime * result + ((competitionPosition == null) ? 0 : competitionPosition.hashCode());
		result = prime * result + ((competitionTime == null) ? 0 : competitionTime.hashCode());
		result = prime * result + ((count == null) ? 0 : count.hashCode());
		result = prime * result + ((entryPerson == null) ? 0 : entryPerson.hashCode());
		result = prime * result + ((entryTime == null) ? 0 : entryTime.hashCode());
		result = prime * result + ((hostTeamId == null) ? 0 : hostTeamId.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((score == null) ? 0 : score.hashCode());
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
		Schedule other = (Schedule) obj;
		if (awayTeamId == null) {
			if (other.awayTeamId != null)
				return false;
		} else if (!awayTeamId.equals(other.awayTeamId))
			return false;
		if (competitionPosition == null) {
			if (other.competitionPosition != null)
				return false;
		} else if (!competitionPosition.equals(other.competitionPosition))
			return false;
		if (competitionTime == null) {
			if (other.competitionTime != null)
				return false;
		} else if (!competitionTime.equals(other.competitionTime))
			return false;
		if (count == null) {
			if (other.count != null)
				return false;
		} else if (!count.equals(other.count))
			return false;
		if (entryPerson == null) {
			if (other.entryPerson != null)
				return false;
		} else if (!entryPerson.equals(other.entryPerson))
			return false;
		if (entryTime == null) {
			if (other.entryTime != null)
				return false;
		} else if (!entryTime.equals(other.entryTime))
			return false;
		if (hostTeamId == null) {
			if (other.hostTeamId != null)
				return false;
		} else if (!hostTeamId.equals(other.hostTeamId))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (score == null) {
			if (other.score != null)
				return false;
		} else if (!score.equals(other.score))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Schedule [id=" + id + ", count=" + count + ", hostTeamId=" + hostTeamId + ", awayTeamId=" + awayTeamId
				+ ", competitionTime=" + competitionTime + ", competitionPosition=" + competitionPosition + ", score="
				+ score + ", entryPerson=" + entryPerson + ", entryTime=" + entryTime + "]";
	}
	
	

}

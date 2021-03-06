package vn.com.omart.backend.domain.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Table(name = "push_notification_token")
@ToString
@AllArgsConstructor
public class PushNotificationToken {

	@Id
	@Column(name = "user_id", columnDefinition = "varchar")
	private String userId;

	@Column(name = "token", columnDefinition = "varchar")
	private String token;

	@Column(name = "client", columnDefinition = "int")
	private int client;

	public String getUserId() {
		return userId;
	}

	public String token() {
		return token;
	}

	public int getClient() {
		return client;
	}

	public void setClient(int client) {
		this.client = client;
	}

	public PushNotificationToken() {}
	public PushNotificationToken(String userId, String token) {
		super();
		this.userId = userId;
		this.token = token;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

}

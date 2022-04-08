package REST.SpringRESTassignments.Q2;

public class user {
        String username;
        String password;
		public String getUsername() {
			return username;
		}
		public void setUsername(String username) {
			this.username = username;
		}
		public String getPassword() {
			return password;
		}
		public void setPassword(String password) {
			this.password = password;
		}
		public user(String username, String password) {
			super();
			this.username = username;
			this.password = password;
		}
		@Override
		public String toString() {
			return "user [username=" + username + ", password=" + password + "]";
		}
}

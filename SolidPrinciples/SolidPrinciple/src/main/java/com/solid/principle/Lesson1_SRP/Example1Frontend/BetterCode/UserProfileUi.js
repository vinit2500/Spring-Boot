/*
  How UI looks like is seperatly done here
*/
function UserProfile({ user }) {
    return (
        <div>
            <h1>User Profile</h1>
            <p>Name: {user.name}</p>
            <p>Email: {user.email}</p>
            {/* More user details */}
        </div>
    );
}
import React from 'react';

/*
  we have just clubed both of them
  now responsibility has been divided.
*/
function UserProfileContainer() {
    const { user, loading, error } = useFetchUserData(123);

    if (loading) return <div>Loading...</div>;
    if (error) return <div>{error}</div>;

    return user ? <UserProfile user={user} /> : <div>No user data.</div>;
}
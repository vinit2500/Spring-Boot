import React, { useState, useEffect } from 'react';
import axios from 'axios';
/* Is there any issue with this code ????
 we do not care about any algorithm here. we care about what's going wrong with
 code quality or implementation.

what's wrong in this code => This UserProfile is doing too much like state management, api calls,
and how UI looks. This breaks the Single Responsibility Principle.

Everything is fine but when issue will come?
=> when maintainence and extensibility.

*/
function UserProfile() {
    const [user, setUser] = useState(null);
    const [loading, setLoading] = useState(false);
    const [error, setError] = useState('');

    useEffect(() => {
        setLoading(true);
        axios.get('/api/user/123')
            .then(response => setUser(response.data))
            .catch(error => setError('Error fetching user data'))
            .finally(() => setLoading(false));
    }, []);

    if (loading) return <div>Loading...</div>;
    if (error) return <div>{error}</div>;

    return (
        <div>
            <h1>User Profile</h1>
            {user && (
                <div>
                    <p>Name: {user.name}</p>
                    <p>Email: {user.email}</p>
                    {/* More user details */}
                </div>
            )}
            {/* Additional unrelated UI elements */}
        </div>
    );
}
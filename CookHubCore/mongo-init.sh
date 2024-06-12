set -e

mongo <<EOF

use CookHub;

use admin

db.createUser({
  user: '$MONGODB_INITDB_ROOT_USERNAME',
  pwd:  '$MONGODB_INITDB_ROOT_PASSWORD',
  roles: [{
    role: 'readWrite',
    db: 'admin'
  }]
})

db.auth('$MONGODB_INITDB_ROOT_USERNAME', '$MONGODB_INITDB_ROOT_PASSWORD');
EOF
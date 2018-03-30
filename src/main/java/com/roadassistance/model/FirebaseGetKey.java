package com.roadassistance.model;

import com.roadassistance.entity.FirebaseKey;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.stereotype.Repository;

@Repository
public class FirebaseGetKey {
    @Autowired
   MongoOperations mongoOperations;

    public FirebaseKey firebaseKey() {
        return mongoOperations.findById("roadassistanceserver", FirebaseKey.class);
    }

    public void firebaseAdd() {
        FirebaseKey firebaseKey = new FirebaseKey(
                "service_account",
                "roadassistanceserver",
                "b622728f95d9e02fcd68e9105690233d2e19525c",
                "-----BEGIN PRIVATE KEY-----\nMIIEuwIBADANBgkqhkiG9w0BAQEFAASCBKUwggShAgEAAoIBAQCVBri3Wp22m/tQ\nvdQQMsT1oSdxSnmpezITR3E+OhfU0hbVgvh8T/9lfASoTL6lZlMHkM24BMkYH040\nGF/MGgatFDjH9nZpVTAUl526cdXiPqq1vcI23/n5Hu7hu5TM4NtiBJAs7ClyCyR/\n1/3CXgBTSpG7OQgLpU72dBhL6HEO4jpN2e7FQ2IN3JnL8OXjYj/okq8xvfJk8JRU\nqFsTO344v7+LZtnHBao7juOqmB73a2+YUZpj4cNO8vxFptkPKGFep3hf1V3NDN7l\n8Rn5HzTm9+MDMIE2S6FfIqe6PxKfeLG0wZHwLGGJ9ohmevgYqcYmcIhHPYfBw0SS\nImhqr08pAgMBAAECgf8ggIFze8/p2RshVkVp7aix6Z6F7DhHPmyCx+dq1ZYHqcpR\nHBTAXVzWRWC+qVOVvztclbhIP22cVTeOem0U6+2I0grlkbCW8ygJVbKQzJhZP6b7\npuc0u09JhfWTmysDhAb/hFSYIj7nyzEABkYnSK50JqSiBfjl5qfSGH/euP3va2e+\n3pMM2Pe3882FsGa28hKlQr4RGCBXa8UjjUcjH4K+PZjPBxcgTOFcUQbbcSeA2RHF\nwYe/JPfTbhWemggd7CH5kyj+v+qFxZluIP4qrPaEEqTPQu6HygOIJd/dmbS4pkan\nOyp3hWGchjBiwzDADhwiXr3f83AjjMcxU5D/FGkCgYEAx2+DJJNTIy+kvsWvbf5T\nrcG5+0BbPi6ubIYPuGqL40QX9avmHN8CGp/AE+Rgdb1KZ0HHk9IGnftCC2Vb43bz\nAWqoRqvdKq2iZU0qjdbAlNnUJJcuyFhmMa2+XOItfDqh1+2QvOncJoQwqCinCFd6\nOnVK43TQk1aUQjtQ+TUbLS0CgYEAv0sfEN48lOrP1ENtYKWRdLHtFcjeYTYKn4I7\nBeZGPAv08J69kivDVxXwMAdQ04HznM0F9oKJKIUQ39ZE6qh3emf27uYOAPeUtc38\nZJHudehLg1rddpLCFM/7Q+d3qMmcBXn54Ff83fMaFiWYvsn+g/IxrN6IjyKkTyxP\nGatbP20CgYAfs/hS7iB/LWmw8dfrUkyXCH66FAbtIZqUodMJ69YE8KQmZ4cS+9hn\nxxFPmDRFQyv6shg5xV9L6c8b5Kbwx83lYcESSuvDhwqTs+qZ1ZOTlfUFRAspyfOk\n3guu1D2Ky/9CRf+GKF7YuJbLhHrY9p71gAPBmKY3ZcH3rVo341tImQKBgQCQv9Bf\nHDttWA0ximAerMpXKjfDrz6PAqyhLJNrEGd/EnEjDotWKyViJWidfzurAH+N3Boy\nAW62KZKuPd3iTt4x0q+o8I4SL0XpGFhu5Xoy4Dcby0sfaUfRJdv08xa5su0Lu9PX\n7dybOlQ4A/UEEac0wrTSIYXmAYmhm16zhtXCNQKBgBGThk7sJluokrPez/U133kc\nrBSizd7lGkC7CV4jcnBs+NnB+Rb9Vf7nl6Jq0Gv2z4imQDKFNo5e0MWg6RO0KRj0\nW3wtBzHR1l4Ii+0yh51iy0UBxK3t+8CqK2N02x0WRyAYsrvpqLrXuj+zMikAP4P0\nHlW5gqBfmXDWzY6QLWpR\n-----END PRIVATE KEY-----\n",
                "firebase-adminsdk-bnkfl@roadassistanceserver.iam.gserviceaccount.com",
                "110820439910561557196",
                "https://accounts.google.com/o/oauth2/auth",
                "https://accounts.google.com/o/oauth2/token",
                "https://www.googleapis.com/oauth2/v1/certs",
                "https://www.googleapis.com/robot/v1/metadata/x509/firebase-adminsdk-bnkfl%40roadassistanceserver.iam.gserviceaccount.com");
        mongoOperations.save(firebaseKey);
    }
}

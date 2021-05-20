
# for building with the maven plugin 
./mvnw spring-boot:build-image


# for building with maven docker as builder and then move to the jre docker 

./mvnw clean package

docker build -f Dockerfile.4 -t love-k8s2-$(git rev-parse HEAD | cut -c 1-8) .





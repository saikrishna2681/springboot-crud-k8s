apt-get update -y
apt-get install zip -y
apt-get install awscli
zip -j log.zip /var/lib/springapp/*
aws s3 cp log.zip s3://log-info2681

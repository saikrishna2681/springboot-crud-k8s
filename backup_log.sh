apt-get update -y
apt-get install zip -y
apt-get install awscli
aws configure set aws_access_key_id "AKIA5FTY6YB3XG7DJ46H"; aws configure set aws_secret_access_key "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"; aws configure set default.region "ap-south-1"
zip -j log.zip /var/lib/springapp/*
aws s3 cp log.zip s3://log-info2681

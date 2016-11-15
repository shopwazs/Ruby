# Reference http://stackoverflow.com/a/18490935/2037928

# Login as root

# Install needed packages
apt-get -y install build-essential zlib1g-dev libssl-dev libreadline6-dev libyaml-dev

cd /tmp

# Download appropriate ruby version https://www.ruby-lang.org/en/downloads/
wget http://cache.ruby-lang.org/pub/ruby/2.1/ruby-2.1.2.tar.gz

# Unpack
tar -xvzf ruby-2.1.2.tar.gz
cd ruby-2.1.2/

# Compile from source
./configure --prefix=/usr/local
make
make install

# Make sure deploy user has access to installing gems
chown -R deploy:staff /usr/local/bin
chown -R deploy:staff /usr/local/lib/ruby

# Login as deploy user

# Install bundler
gem install bundler

# Locally
cap production deploy

# Remove the old manifest.yml file
rm /u/apps/YOUR_APP_NAME/shared/assets/manifest.yml

# I also had to make the unicorn binary into a binstub

# Use the official Node.js LTS (Long Term Support) Alpine image
FROM node:lts-alpine

# Install simple http server for serving static content
RUN npm install -g http-server

# Set the working directory
WORKDIR /app

# Copy both 'package.json' and 'package-lock.json' (if available)
COPY package*.json ./

# Install project dependencies
RUN npm install

# Copy project files and folders to the current working directory
COPY . .

# Build app for production with minification
RUN npm run build

# Expose the port on which the app will run
EXPOSE 8081

# Command to run the application
CMD [ "http-server", "dist", "-p", "8081" ]

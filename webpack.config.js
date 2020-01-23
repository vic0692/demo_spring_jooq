const path = require('path');

module.exports={
    entry: {
        main: './src/main/resources/static/js/main.js',
    },
    output: {
        path: __dirname + '/src/main/resources/static/dist',
        filename: 'bundle.js'
    }
};

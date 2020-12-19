import axios from "axios";


export function get(path = '') {
    return axios.get(path).catch(error => {
        console.log(error);
        throw new Error('Http Get Error : api.service.js');
    })
}

export function post(path = '', params) {
    return axios.post(path, params).catch(error => {
        console.log(error);
        throw new Error('Http Post Error : api.service.js');
    })
}

import { EndpointRequestInit as EndpointRequestInit_1 } from "@vaadin/hilla-core";
import client_1 from "../connect-client.js";
async function getString_1(init?: EndpointRequestInit_1): Promise<string | undefined> { return client_1.call("CustomClientEndpoint", "getString", {}, init); }
export { getString_1 as getString };
